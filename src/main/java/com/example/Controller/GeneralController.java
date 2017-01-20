package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.Model.Employee;
import com.example.Model.EmployeeRepo;

@Controller
@SessionAttributes("personObj")
public class GeneralController {
	@Autowired
	EmployeeRepo erepo;
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	
	public ModelAndView welcomePage()
	{
		Authentication authq = SecurityContextHolder.getContext().getAuthentication();
		String name = authq.getName();
		ModelAndView mod = new ModelAndView();
		mod.addObject("personObj", (erepo.findOneByEmailid(name)).getFirstname());
		mod.setViewName("welcome");
		return mod;
	}
	
	@RequestMapping(value="/welcome", method= RequestMethod.GET)
	public ModelAndView welcomePage1()
	{
		
		return new ModelAndView("welcome");
	}
	
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public ModelAndView loginpage(@RequestParam(value="error", required=false)String error)
	{
		ModelAndView mod = new ModelAndView();
		mod.setViewName("login");
		if(error != null)
		{
			mod.addObject("error", "INVALID CREDENTIALS");
		}
		return mod;
	}
	
	@RequestMapping(value="/admin/employee-edit", method=RequestMethod.GET)

	public ModelAndView editemployeebyadmin()
	{
		return new ModelAndView("edituserbyadmin");
	}
	
	@RequestMapping(value="/user/employee-edit", method=RequestMethod.GET)
	public ModelAndView edituser(Model model)
	{
		
		model.addAttribute("User", new Employee());
		return new ModelAndView("user-edit-profile");
	}
	
	@RequestMapping(value="/user/getuserdetails",produces = "application/json", method = RequestMethod.GET)
	public ResponseEntity<Employee> getuserdetails()
	{
		Authentication authq = SecurityContextHolder.getContext().getAuthentication();
		String name = authq.getName();
		return new ResponseEntity<Employee>(erepo.findOneByEmailid(name),HttpStatus.OK);
	}
	
	@RequestMapping(value="/user/employee-edit", method=RequestMethod.POST)
	public String saveuser(@ModelAttribute("User") Employee emp)
	{
		erepo.save(emp);
		return "redirect:"+"/";
	}
	
	@RequestMapping(value="/403", method=RequestMethod.GET)
	public String error()
	{
		return "redirect:"+"/";
	}
	
	/*
	 * 
	 * ADMIN PART CONTROLLER*/
	
	@RequestMapping(value="/admingetemployee", method= RequestMethod.GET)
	public ModelAndView adminpanal()
	{
		return new ModelAndView("adminhome");
	}
	
	
	@RequestMapping(value="/admingetemployee", method=RequestMethod.POST)
	public ModelAndView getEmployeeDetailsToAdmin(@RequestParam("emailid") String emailid)
	{
		Employee e = erepo.findOneByEmailid(emailid);
		
		ModelAndView mod = new ModelAndView("adminpaneltoedituser","User", new Employee(e.getEmployeeid(),e.getEmailid(),e.getFirstname(),e.getLastname(),e.getPassword(),e.getSalary(),e.getJobrole(),e.getEmployeetype()));
		
		
		return mod;
		
	}
	
	@RequestMapping(value="/adminpaneltoedituser", method=RequestMethod.GET)
	public ModelAndView getempdetails(@ModelAttribute Employee employee)
	{
		ModelAndView mod = new ModelAndView("adminpaneltoedituser","User",employee);
		
		return mod;
	}
	@RequestMapping(value="/adminpaneltoedituser", method=RequestMethod.POST)
	public String saveuserbyAdmin(@ModelAttribute("User") Employee emp)
	{
		erepo.save(emp);
		return "redirect:"+"/";
	}
	
	@RequestMapping(value="/admincreateuser", method= RequestMethod.GET)
	public ModelAndView createUser(@ModelAttribute Employee employee)
	{
		ModelAndView mod = new ModelAndView("admincreateuser","User",employee);
		
			return mod;
	}

	@RequestMapping(value="/admincreateuser", method= RequestMethod.POST)
	public String saveCreatedUser(@ModelAttribute("User") Employee emp)
	{
		
		
		erepo.save(emp);
		
			return "redirect:"+"/";
	}

}
