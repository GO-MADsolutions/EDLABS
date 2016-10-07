/**
 * 
 *
 */
(function()
		{
	var demo = angular.module("demo", []);
	demo.service('getdata', function($http,$q)
			{
				
				this.responsedata = function(URL)
				{
					var area;
					var deferred = $q.defer();
					$http({
						method : 'GET',
						cache : true,
						url : URL
					}).then(function(data) {
						deferred.resolve(data);

					});
					return deferred.promise;
				}
				
		
			});
	demo.controller("demo1",
			function($scope, $http, getdata) {
		if (navigator.geolocation) navigator.geolocation.getCurrentPosition(onPositionUpdate);
		 
		function onPositionUpdate(position) {
		     var lat = position.coords.latitude;
		     var lng = position.coords.longitude; 
		     
		}
				var Areas= getdata.responsedata('/demo/GetAllAreas');
				Areas.then(function(data)
						{
					
							$scope.areas=data.data;
							
						});
				var Services = getdata.responsedata('/demo/GetAllServices');
				Services.then(function(data)
						{
							$scope.services=data.data;
						});
			});

	demo.controller("carpenters", function($scope, $http, getdata)
			{
		$scope.lat;
		$scope.lng;
		if (navigator.geolocation) navigator.geolocation.getCurrentPosition(onPositionUpdate);
		 
		function onPositionUpdate(position) {
			$scope.lat = position.coords.latitude;
			$scope.lng = position.coords.longitude;
			var ServiceProviders = getdata.responsedata('/demo/Carpenter/getnearbyCarpenter?lat='+$scope.lat+'&lng='+$scope.lng);
			ServiceProviders.then(function(data)
					{
				$scope.carpenters = data.data;
					});     
		}
		
			
			});
	})();
