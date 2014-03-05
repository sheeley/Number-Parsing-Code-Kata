import random
from pyfiglet import Figlet
f = Figlet(font='banner')
ints = [[str(random.randint(0, 9)) for y in range(20)] for x in range(10000)]
with open('bigData.trendy.txt', 'w+') as output_file:
    for line in ints:
        output_file.write(f.renderText(''.join(line)))
