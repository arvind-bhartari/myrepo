var testApp = angular.module('TestApp',['ui.bootstrap']);

testApp.controller('TestCtrl',function($scope,$http){
	$scope.angularMsg = 'user',
	$scope.offset = 0,
	$scope.limit = 5,
	$scope.maxSize = 3,
	$scope.currentPage = 1;
	
	if(typeof searchListener != "undefined"){
	    watchListener();
	}
	watchListener = $scope.$watch('currentPage' , function(){
		
		$scope.offset = $scope.currentPage - 1;
		
		$http.get(contextPath + '/listing?offset=' + $scope.offset + '&limit=' + $scope.limit).success(function(data){
			$scope.userList = data.userList;
			$scope.numPages = data.size;
		}).error(function(data){
			alert("Some error occured!");
			console.log("Some error occured!");
		});
	})
	
});