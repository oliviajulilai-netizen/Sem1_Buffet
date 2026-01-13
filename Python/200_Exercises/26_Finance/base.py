#Run "pip install yfinance" in a terminal

import yfinance as yf
stock = ["WMT" , "TGT" , "AAPL" , "MSFT" , "AMZN" , "TSLA" , "GOOG" , "KO" , "CAKE" , "LUV"]
for x in range(0,10):
    x = 0
    stock = yf.Ticker("GOOGL")
    current_price = stock.history(period="1d")["Close"][0]
    info = stock.info
    print(info["longName"])
    print(info["website"])
    print("GOOGL Current Price:", current_price)

inn = (input("What company do you want to look up?"))
inn = yf.Ticker("GOOGL")
current_price = inn.history(period="1d")["Close"][0]
info = inn.info
print(info["longName"])
print(info["website"])
print("GOOGL Current Price:", current_price)


