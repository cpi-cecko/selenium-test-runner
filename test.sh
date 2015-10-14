#!/bin/bash

tests_dir=$1

if [ -z $tests_dir ]
then
  echo "Usage: test.sh <tests_dir>"
  exit
fi

./phantomjs --webdriver=4444 &
phantom_pid=$!

for test_file in "$tests_dir"/*
do
  date=$(date +"%R %d %h %y")
  echo "[$date] Testing :$test_file:" >> test_log
  echo "=====================================================================" >> test_log
  echo >> test_log
  perl $test_file >> test_log
  echo >> test_log
done

kill -9 $phantom_pid
