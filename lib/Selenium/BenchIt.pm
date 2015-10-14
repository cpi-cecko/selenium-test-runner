package Selenium::BenchIt;


use strict;
use warnings;
use v5.12;

BEGIN {
	require Exporter;
	our @ISA = qw(Exporter);
	our @EXPORT = qw(&benchit);
}


use Benchmark qw(:hireswallclock);


sub benchit {
    my $func = shift;

    eval {
        my $time_res = timeit(1, &$func); 
        print "Time: " . $time_res->real . "\n";
    };
    if ($@) {
        print "Error: $@\n";
        exit;
    }
}

1;
