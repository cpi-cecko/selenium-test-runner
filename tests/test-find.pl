#!/usr/bin/env perl

use strict;
use warnings;
use Encode;
use Selenium::Remote::Driver;
use Test::More;

my $driver = Selenium::Remote::Driver->new( remote_server_addr => "localhost",
                                               port => 4444,
                                               browser_name => "firefox");

$driver->get("http://credoweb.bg");
$driver->find_element(Encode::decode('UTF-8', "span.element-subheading"), "css")->click;
$driver->find_element(Encode::decode('UTF-8', "city"), "name")->click;
$driver->find_element(Encode::decode('UTF-8', "city"), "name")->clear;
$driver->find_element(Encode::decode('UTF-8', "city"), "name")->send_keys("София");

$driver->find_element(Encode::decode('UTF-8', "Димитър Христев"), "link")->click;

print "Got Димитър Христев\n";
$driver->find_element(Encode::decode('UTF-8', "div.tabs-container"), "css")->click;

$driver->find_element(Encode::decode('UTF-8', "(//a[contains(text(),'Публикации')])[3]"), "xpath")->click;
print "Got Публикации\n";

$driver->find_element(Encode::decode('UTF-8', "ЗА МЕН"), "link")->click;
print "Got ЗА МЕН\n";

$driver->find_element(Encode::decode('UTF-8', "ВСИЧКО"), "link")->click;
print "Got ВСИЧКО\n";

$driver->quit();
done_testing();
