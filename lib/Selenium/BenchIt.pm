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

    my $date = `date +"%F %T"`;
    chomp $date;
    print "\n$date Testing [$elemInfo]";
    eval {
        my $time_beg = [gettimeofday];
        &$actionFunc;
        print "\n$date Time: " . tv_interval($time_beg);
    };
    if ($@) {
        print "\n$date Error: " . Encode::encode('UTF-8', $@);
        exit;
    }
}

1;
