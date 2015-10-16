package Selenium::BenchIt;


use strict;
use warnings;
use v5.12;

BEGIN {
	require Exporter;
	our @ISA = qw(Exporter);
	our @EXPORT = qw(&benchit);
}


use Time::HiRes qw(gettimeofday tv_interval);
use Encode;


sub benchit {
    my ($elemInfo, $actionFunc) = @_;

    print "Testing [$elemInfo]\n";
    eval {
        my $time_beg = [gettimeofday];
        &$actionFunc;
        print "  Time: " . tv_interval($time_beg) . "\n";
    };
    if ($@) {
        print "  Error: " . Encode::encode('UTF-8', $@) . "\n";
        exit;
    }
}

1;
