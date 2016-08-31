(function() {
    'use strict';

    angular
        .module('jpaNeo4JTestApp')
        .factory('notificationInterceptor', notificationInterceptor);

    notificationInterceptor.$inject = ['$q', 'AlertService'];

    function notificationInterceptor ($q, AlertService) {
        var service = {
            response: response
        };

        return service;

        function response (response) {
            var alertKey = response.headers('X-jpaNeo4JTestApp-alert');
            if (angular.isString(alertKey)) {
                AlertService.success(alertKey, { param : response.headers('X-jpaNeo4JTestApp-params')});
            }
            return response;
        }
    }
})();
