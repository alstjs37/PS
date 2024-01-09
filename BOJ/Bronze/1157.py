from collections import Counter

word = list(input().lower())
word_counter = Counter(word)

mc_word = word_counter.most_common()
ans = '?' if len(mc_word) > 1 and mc_word[0][1] == mc_word[1][1] else mc_word[0][0].upper()
print(ans)