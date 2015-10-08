#!/bin/bash

tests_dir="$1"

for test_file in "$tests_dir"/*
do
    test_file_fixed="${test_file/.java/_fixed.java}"
    ./fix-css-upper.pl < "$test_file" > "$test_file_fixed"
    rm $test_file
    mv $test_file_fixed $test_file
done
