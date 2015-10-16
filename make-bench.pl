#!/usr/bin/env perl

use strict;
use warnings;
use v5.012;


my $to_fix = qr/^(\$driver->find_element.*"(?<elem>.+?)"\), "(?<type>.+?)".*)/;
my $to_pause = qr/^(# ERROR:.*Unsupported command \[getAllFields .*)/; 

while (<STDIN>) {
  if ($_ =~ $to_fix) {
    print "benchit(\"$+{elem}, $+{type}\", sub { $1 });\n";
  } elsif ($_ =~ $to_pause) {
    print "\$driver->pause(500);\n";
  } else {
    print $_;
  }
}
