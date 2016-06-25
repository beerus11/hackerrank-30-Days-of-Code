#!/bin/python

import sys
n = int(raw_input().strip())
string = '{0:b}'.format(n)
array=string.split('0')
array.sort()
print len(array[len(array)-1])
