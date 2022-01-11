import csv, time

file = 'scopus_R.csv'

def getTitle():
  csvFile = open(file)
  reader = csv.reader(csvFile)
  links = []
  for line in reader:
    links.append((line[1]))
  return links

links = getTitle()

print(links[2])