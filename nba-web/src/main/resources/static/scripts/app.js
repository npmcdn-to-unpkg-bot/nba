/**
 * app config script
 * 
 */
angular
	.module('nbaApp',[
	  'ngAnimate',
	  'ngCookies',
	  'ngResource',
	  'ngRoute',
	  'ngSanitize',
	  'ngTouch'
    ])
    .config(function ($routeProvider) {
    	$routeProvider
    		.when('/',{
    			templateUrl: 'views/main.html',
    			controller: 'MainCtrl'
    		})
    		.when('/players/:teamId',{
    			templateUrl: 'views/players.html',
    			controller: 'PlayersCtrl'
    		})
    		.otherwise({
    				redirectTo:'/'
    			});
    });	                  