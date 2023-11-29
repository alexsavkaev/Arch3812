from random import randint

from Fabrics.gem_generator import GemGenerator
from Fabrics.gold_generator import GoldGenerator
from Fabrics.silver_generator import SilverGenerator

if __name__=='__main__':
    GoldGenerator().create_item().open()
    generators = [GoldGenerator(), GemGenerator(), SilverGenerator()]
    for i in range(10):
        generators[randint(0, 2)].create_item().open()
