
def Fact(num):
	if 	num==1:
		return num
	else:
		return num*Fact(num-1)

class Main:
	def start(self):
		n = int(input())
		num = Fact(n)
		print(num)


if __name__ == '__main__':
    Main().start()