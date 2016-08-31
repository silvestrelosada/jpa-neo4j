(function () {
    'use strict';

    angular
        .module('jpaNeo4JTestApp')
        .factory('Register', Register);

    Register.$inject = ['$resource'];

    function Register ($resource) {
        return $resource('api/register', {}, {});
    }
})();
