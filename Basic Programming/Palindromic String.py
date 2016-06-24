'''
# Read input from stdin and provide input before running code

name = raw_input('What is your name?\n')
print 'Hi, %s.' % name
'''
flag =True
name = raw_input()
for a,b in zip(name, reversed(name)):
	if a!=b:
		flag=False
		break
if flag==True:
	print 'YES'
else :
	print 'NO'
	
	   
		
	