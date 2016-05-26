/**
 * Players view
 */
angular.module('nbaApp')
	.controller('PlayersCtrl', function($scope, $http, $routeParams) {
	$http({
		method: 'GET',
		url: '/players/teams/' + $routeParams.teamId
	}).then(function(response) {
		$scope.players = response.data;
	}, function(response) {
		console.error('Error requesting players');
	});

});

