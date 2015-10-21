#!/bin/bash

tests_dir=$1

if [ -z $tests_dir ]
then
  echo "Usage: test.sh <tests_dir>"
  exit
fi

./phantomjs --webdriver=4444 &
phantom_pid=$!

# sudo httpry -F | grep credoweb >> test_log &
# httpry_pid=$!

for test_file in "$tests_dir"/*
do
  if [[ "$test_file" =~ "_log" ]]
  then
    echo "Nothing to do"
  else
    test_log="$test_file""_log"
    date=$(date +"%F %T")
    echo "$date Testing :$test_file:" >> "$test_log"
    T="$(date +%s)"
    perl $test_file >> "$test_log"
    T="$(($(date +%s)-T))"
    echo "Time in seconds: ${T}" >> "$test_log"
    steps=$(cat $test_log | grep Time | wc -l)
    echo "Total steps: $steps" >> "$test_log"
    echo >> "$test_log"
  fi
done

# sleep 5 # Gather any pending HTTP requests

kill -9 $phantom_pid
# kill -9 $httpry_pid

# cat test_log | sort -k1,1 -k2,2 --stable > test_log_sorted
# if [[ $? -eq 0 ]]
# then
#   mv test_log_sorted test_log
# else 
#   echo "Something wrong with sorting..."
# fi
