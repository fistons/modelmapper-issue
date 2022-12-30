# ModelMapper issue

Test case showing how I have trouble mapping an interface to a concrete type using modelmapper's Converter

ModelMapper's implicit mapping is disabled on purpose.

Please note that using an object instantiated by a Spring Data JPA projection seems to work perfectly (use case not in
the tests)

Uses:
 * Java 17
 * ModelMapper 3.1.1 (also tried with 2.3.3, the spring boot's 2.7.x bundled version)