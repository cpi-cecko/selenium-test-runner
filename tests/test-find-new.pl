use strict;
use warnings;
use Encode;
use Selenium::Remote::Driver;
use Test::More;

my $driver = Selenium::Remote::Driver->new( remote_server_addr => "localhost",
                                               port => 4444,
                                               browser_name => "firefox");

$driver->get("http://credoweb.bg");
$driver->find_element(Encode::decode('UTF-8', "span.element-heading"), "css")->click;
$driver->find_element(Encode::decode('UTF-8', "city"), "name")->click;
$driver->find_element(Encode::decode('UTF-8', "city"), "name")->clear;
$driver->find_element(Encode::decode('UTF-8', "city"), "name")->send_keys("София");
$driver->find_element(Encode::decode('UTF-8', "//input[\@value='Търси']"), "xpath")->click;
$driver->find_element(Encode::decode('UTF-8', "Димитър Христев"), "link")->click;
$driver->find_element(Encode::decode('UTF-8', "ЗА МЕН"), "link")->click;
$driver->find_element(Encode::decode('UTF-8', "ВСИЧКО"), "link")->click;
$driver->quit();
done_testing();
