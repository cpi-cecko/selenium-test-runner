#!/usr/bin/env perl

use strict;
use warnings;
use v5.012;

use Encode;


my $to_fix = qr/driver\.findElement\(By\.linkText\(\"(.+)\"\)\)\.(.+);/;

while (<STDIN>) {
  if ($_ =~ $to_fix) {
    my $text = Encode::decode('UTF-8', $1);
    my $cmd = $2;
    my $fixed = 
      "    {\n" .
      "      WebElement link;\n" .
      "      try {\n" .
      "        link = driver.findElement(By.xpath(\"//a[text()=\'$text\']\"));\n" .
      "        try {\n" .
      "          link.$cmd;\n" .
      "        } catch(ElementNotVisibleException ex) {\n" .
      "          try {\n" .
      "            link = driver.findElement(By.linkText(\"$text\"));\n" .
      "          } catch(NoSuchElementException ex2) {\n" .
      "            link = driver.findElement(By.linkText(\"".uc($text)."\"));\n" .
      "          }\n" .
      "          link.$cmd;\n" .
      "        }\n" .
      "      } catch(NoSuchElementException ex) {\n" .
      "        try {\n" .
      "          link = driver.findElement(By.linkText(\"$text\"));\n" .
      "        } catch(NoSuchElementException ex2) {\n" .
      "          link = driver.findElement(By.linkText(\"".uc($text)."\"));\n" .
      "        }\n" .
      "        link.$cmd;\n" .
      "      }\n" .
      "    }\n";
    print $fixed;
  } else {
    print $_;
  }
}
