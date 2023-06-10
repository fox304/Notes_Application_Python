def err(notebook,x):
    while not notebook.get(x):  # выполняется пока нет ключа 'x'
        print("такого идентификатора в заметках нет, введите корректное число ")
        x = input()
    return x