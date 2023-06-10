import output_specific_note
def print_all(notebook):
    print('-------------------')
    print(f"В ноутбуке {len(notebook)} записей:")
    print('-------------------')
    for i in notebook:
        output_specific_note.print_one(notebook,i)
