package components {
    import model.UserData;
    import mx.controls.Alert;
    import flash.events.Event;
    import flash.events.MouseEvent;
    import mx.controls.Button;
    import mx.containers.HBox;

    public class MainNavigationComponent extends HBox {
        public function MainNavigationComponent() {
            super();
            initMyComponent();
        }

        private function initMyComponent():void {
            addChild(createNewButton('allbooks', 'All Books'));
            if (UserData.getInstance().isAdmin()) {
                addChild(createNewButton('newbook', 'New Book'));
            }
        }

        private function clickEventHandler(event:Event):void {
            dispatchEvent(new MainNavigationEvent(MainNavigationEvent.SELECT_ITEM, event.currentTarget.id));
        }

        private function createNewButton(id:String, label:String):Button {
            var aButton:Button = new Button();
            aButton.id = id;
            aButton.label = label;
            aButton.addEventListener(MouseEvent.CLICK,clickEventHandler);
            return aButton;
        }
    }
}