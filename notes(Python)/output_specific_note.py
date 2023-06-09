def print_one_note(notebook):
    
    num = int(input("введите идентификатор записи: "))
    """
    notebook = {'title':{'one':{1:[time,'первая запись'],2:[time,'вторая запись'],3:[time,'третья запись']},
                        'two':{4:[time,'первая запись'],5:[time,'вторая запись'],6:[time,'третья запись'],7:[time,'четвёртая запись']}
                        } 
               }
"""
    for i in notebook['title']:
        dic = notebook['title'][i]
        if not num in dic: continue 

        print(f"заголовок: {i} \nзапись сделана: {dic.get(num)[0]}\n{dic.get(num)[1]}")


