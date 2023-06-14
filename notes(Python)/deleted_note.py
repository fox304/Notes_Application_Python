import errors

def del_note(notebook):
    num = input("введите номер записи для удаления: ")
    num = errors.err(notebook,num)
    notebook.pop(num)
    print(f"Запись номер {num} удалена.")
