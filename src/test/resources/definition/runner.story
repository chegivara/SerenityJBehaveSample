
Scenario: Looking for not existed definition
Meta:
@tag component:UI
Given word to find: bear
When move to https://translate.google.com/?hl=ru
Then make search by bear
