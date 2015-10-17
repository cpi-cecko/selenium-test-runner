#!/bin/bash

test_script="$1"

if [ -z $test_script ]
then
  echo "Usage: fix-one.sh <test_script>"
  exit
fi

if [ -d $test_script ]
then
  echo "[$test_script] is a directory"
  exit
fi

test_script_fixed="${test_script/.pl/_fixed.pl}"
./make-bench.pl < "$test_script" > "$test_script_fixed"

if [[ $? -eq 0 ]]
then
  rm $test_script
  mv $test_script_fixed $test_script
fi
