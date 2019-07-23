def sortStudents(students):
    students.sort(key=lambda r: r.split(" ")[-1])
    return students