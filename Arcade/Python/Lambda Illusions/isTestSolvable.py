def isTestSolvable(ids, k):
    digitSum = lambda questionId : sum( [int(x) for x in str(questionId)] )

    sm = 0
    for questionId in ids:
        sm += digitSum(questionId)
    return sm % k == 0