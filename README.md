# SpaceInvaders

# classe SpaceInvaders
in questa classe si estende la classe jFrame che ci permette di avere delle funzionalità riguardati l' ambiente grafico come per esempio cliccare la "x" per chiudere la finestra di gioco.

Per quanto riguarda la classe Space essa estende la classe Canvas che ci permette di catturare gli input dell' utente come per esempio il click di un pulsante della tastiera e aggiungere elementi grafici.

# step1
In questo step abbiamo creato la classe Intro che serve ad aggiungere una scritta e degli elementi grafici,questo è possibile perchè la classe Intro eredita la classe Space che a sua volta ereditala classe Canvas.

#step2 
in questo step si vuole dare un' animazione alla scritta che compare facendola venire verso l'interno dello schermo,per far ciò  si crea un metodo run all'interno della classe Intro e si richiama il metodo repaint(ereditato dalla classe Canvas) all' interno di un ciclo.Dopo che il medoto paint sviluppa un immagine si chiama il metodo repaint ch richiamerà il metodo paint cancellando l'immagine sviluppata in prcedenza. 
