package MVC;
    public class HelloController {
        private WrapperModel model;
        private HelloLogic view;

        public HelloController(WrapperModel model, HelloLogic view) {
            this.model = model;
            this.view = view;

            // First: make the form display the text from this.model

            view.form().getJValueFeild().setText(model.getText());
            // now attach event handling logic to the two buttons...
            // note: you'll need to call model.setText(..) in each to update the model
            //       with the changed/reversed text

            view.form().getReverseText().addActionListener(a ->{
                //get reverse text
                String rvStr = model.reverseString();
                //update the model
                model.setText(rvStr);
                //update the view
                view.form().getJValueFeild().setText(model.getText());
            });

            view.form().getSecString().addActionListener(a ->{
                String txt = view.form().getEnterStringTextField().getText();
                //update the model
                model.setText(model.getText() + txt);
                //update the view
                view.form().getEnterStringTextField().setText(model.getText());
                view.form().getEnterStringTextField().setText("");
            });
        }
    }

