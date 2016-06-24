'''
# Read input from stdin and provide input before running code

name = raw_input('What is your name?\n')
print 'Hi, %s.' % name
'''
count=0
inputString = raw_input()
numbers = inputString.split()
for num in range(int(numbers[0]),int(numbers[1])+1) :
	if num%int(numbers[2])==0:
		count=count+1
	
print count