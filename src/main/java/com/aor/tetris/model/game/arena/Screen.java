package com.aor.tetris.model.game.arena;


import com.aor.tetris.model.game.BlockRestrictions;
import com.aor.tetris.model.game.elements.BlockHero;
import com.aor.tetris.model.game.forms.Forms;
import com.aor.tetris.model.game.forms.QueueForms;

public class Screen {
        private final int width;
        private final int height;

        private QueueForms queue;
        private Forms forms;

        private BlockRestrictions blockRestrictions;



        public Screen(int width, int height) {
            this.width = width;
            this.height = height;
            this.queue = new QueueForms();
            this.forms = queue.popNext();


        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public QueueForms getQueueForms() {
            return queue;
        }



        public Forms getForms() { return forms; }

        public void setForms(Forms fomrs) { this.forms = fomrs;}

        public BlockRestrictions getBlockRestrictions(){
            return blockRestrictions;
        }
}
