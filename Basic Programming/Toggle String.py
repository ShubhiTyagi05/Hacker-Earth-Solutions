'''
# Read input from stdin and provide input before running code


print 'Hi, %s.' % name
'''
newString=''
name = raw_input()
for letter in name : 
	if letter>='a':
		newString=newString+letter.upper()
	elif letter>='A' :
	    newString=newString+letter.lower()
print newString