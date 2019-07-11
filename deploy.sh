#!/bin/bash

DIR=$2

echo "Running Dummy Deploy.sh"

OUTPUT_DIR=$4
echo $OUTPUT_DIR
ifconfig
echo | ls
cat $OUTPUT_DIR/infrastructure.properties
