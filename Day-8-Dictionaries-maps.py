# Enter your code here. Read input from STDIN. Print output to STDOUT
t=input()
data=dict()
index=[]
for i in range(0,t):
    array=raw_input().split(" ")
    data[array[0]]=array[1]
for k in range(0,t):
    inp= raw_input()
    if data.has_key(inp):
        print inp+"="+data[inp]
    else:
        print "Not found"
