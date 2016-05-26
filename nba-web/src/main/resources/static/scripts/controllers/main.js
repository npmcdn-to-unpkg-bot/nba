/**
 * angular main script
 * teams view
 */
angular.module('nbaApp')
	.controller('MainCtrl', function($scope, $http) {
	$http({
		method : 'GET',
		url : '/teams/'
	}).then(function(response){
		$scope.teams = response.data;
	},function(response){
		console.error('Error requestiong teams');
	});
});
