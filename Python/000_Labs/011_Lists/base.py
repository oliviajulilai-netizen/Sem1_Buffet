import random
print("Random joke generator")
thislist = ["What did the toilet say to the other? You look flushed.", "Did you hear about the new movie? It's called constipation. It hasn't come out yet", "You're a joke", "How do you get pikachu to ride the bus? You poke-him on", "What do you call a pig that does karate? Pork-chop"]
joke = int(random.randrange(5))
print(thislist[joke])
print("HAHAHA!!!")