javac MarkdownParse.java
for MD in *.md
do
  echo $MD
  java MarkdownParse $MD
  echo ""
done
