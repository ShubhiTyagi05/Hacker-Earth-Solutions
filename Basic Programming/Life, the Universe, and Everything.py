'''
# Read input from stdin and provide input before running code

name = raw_input('What is your name?\n')
print 'Hi, %s.' % name
'''
number = int(raw_input())
while (number!=None):
    if number==42:
	   exit()
    else :
	  print number
	  number = int(raw_input())
