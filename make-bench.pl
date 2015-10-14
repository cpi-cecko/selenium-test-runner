#!/usr/bin/env perl

use strict;
use warnings;
use v5.012;

use Encode;


my $to_fix = qr/(\$driver->find_element.*)/;

while (<STDIN>) {
  if ($_ =~ $to_fix) {
    my $fixed =  "benchit(sub { $1 });\n";
    print $fixed;
  } else {
    print $_;
  }
}
