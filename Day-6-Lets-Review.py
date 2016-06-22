# Enter your code here. Read input from STDIN. Print output to STDOUT
t=input()
for i in range(0,t):
    string =raw_input()
    print ''.join([string[i] for i in range(0,len(string),2)])+" "+''.join([string[i] for i in range(1,len(string),2)])
