use strict;
use warnings;
use Selenium::Remote::Driver;
use Test::More;

my $driver = Selenium::Remote::Driver->new( remote_server_addr => "localhost",
                                               port => 4444,
                                               browser_name => "firefox");

# $driver->debug_on;                                        
$driver->get("http://credoweb.bg");
$driver->find_element("Публикации", "link")->click;
$driver->find_element("Акушерство и гинекология", "link")->click;
$driver->find_element("//div[\@id='articlesList']/div[2]/div[2]/a/span[2]/span", "xpath")->click;
$driver->find_element("УМБАЛ Д-р Г. Странски", "link")->click;
$driver->find_element("(//a[contains(text(),'Събития')])[2]", "xpath")->click;
$driver->find_element("Форум", "link")->click;
$driver->find_element("Задайте своя въпрос към специалист", "link")->click;
$driver->quit();
done_testing();
