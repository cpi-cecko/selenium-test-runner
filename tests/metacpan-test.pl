#!/usr/bin/env perl

use strict;
use warnings;
use Selenium::Remote::Driver;
use Test::More;

my $driver = Selenium::Remote::Driver->new();
$driver->get('http://metacpan.org/');

$driver->find_element("search-input", "id")->clear;
$driver->find_element("search-input", "id")->send_keys("mojolicious");
$driver->find_element("button.btn.search-btn", "css")->click;
$driver->find_element("Mojolicious", "link")->click;
$driver->find_element("SEE ALSO", "link")->click;
$driver->quit();
done_testing();
