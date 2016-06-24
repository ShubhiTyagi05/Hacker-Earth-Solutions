'''
# Read input from stdin and provide input before running code

name = raw_input('What is your name?\n')
print 'Hi, %s.' % name
'''

l= int(raw_input())
number = raw_input()
for x in range (0,int(number)):
	wh = raw_input().split()
	w = wh[0]
	h = wh[1]
	if int(w)<l or int(h)<l :
		print 'UPLOAD ANOTHER'
	else:
		if int(w)==int(h):
			print'ACCEPTED'
		else :
			print 'CROP IT'
