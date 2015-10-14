#!/bin/bash

tests_dir="$1"

if [ -z $tests_dir ]
then
  echo "Usage: fix-all.sh <tests_dir>"
  exit
fi

for test_file in "$tests_dir"/*
do
  if [ -d $test_file ]
  then
    continue
  fi

  test_file_fixed="${test_file/.pl/_fixed.pl}"
  ./make-bench.pl < "$test_file" > "$test_file_fixed"
  rm $test_file
  mv $test_file_fixed $test_file
done
