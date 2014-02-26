#include <pebble.h>

static Window *day_window;
static Window *time_slot_window;

static MenuLayer *day_menu_layer;
static MenuLayer *time_slot_menu_layer;

static int day_selected;
static int time_slot_selected;

// Time Slot Window


static int16_t time_slot_get_cell_height_callback(struct MenuLayer *menu_layer, MenuIndex *cell_index, void *data) {
  return 44;
}

static void time_slot_draw_row_callback(GContext* ctx, Layer *cell_layer, MenuIndex *cell_index, void *data) {
  const int index = cell_index->row;
  switch (index) {
      case 0:
        menu_cell_basic_draw(ctx, cell_layer, "10:15 - 10:45", NULL, NULL);
        break;
      case 1:
        menu_cell_basic_draw(ctx, cell_layer, "11:00 - 12:00", NULL, NULL);
        break;
      case 2:
        menu_cell_basic_draw(ctx, cell_layer, "1:00 - 2:00", NULL, NULL);
        break;
      case 3:
        menu_cell_basic_draw(ctx, cell_layer, "2:15 - 3:15", NULL, NULL);
  }
}

static uint16_t time_slot_get_num_rows_callback(struct MenuLayer *menu_layer, uint16_t section_index, void *data) {
  return 4;
}

static void time_slot_select_callback(MenuLayer *menu_layer, MenuIndex *cell_index, void *data) {
  APP_LOG(APP_LOG_LEVEL_DEBUG, "selected time slot");
/*
  const int index = cell_index->row;
  time_slot_window = window_create();
  window_set_window_handlers(day_window, (WindowHandlers) {
    .load = time_slot_window_load,
    .unload = time_slot_window_unload,
  });
  window_stack_push();*/
}


static void time_slot_window_load(Window *window) {
  APP_LOG(APP_LOG_LEVEL_DEBUG, "time_slot_window_load start");

  Layer *window_layer = window_get_root_layer(window);
  GRect bounds = layer_get_bounds(window_layer);

  GRect window_frame = layer_get_frame(window_layer);
  time_slot_menu_layer = menu_layer_create(window_frame);
  menu_layer_set_callbacks(time_slot_menu_layer, NULL, (MenuLayerCallbacks) {
    .get_cell_height = (MenuLayerGetCellHeightCallback) time_slot_get_cell_height_callback,
    .draw_row = (MenuLayerDrawRowCallback) time_slot_draw_row_callback,
    .get_num_rows = (MenuLayerGetNumberOfRowsInSectionsCallback) time_slot_get_num_rows_callback,
    .select_click = (MenuLayerSelectCallback) time_slot_select_callback
  });
  menu_layer_set_click_config_onto_window(time_slot_menu_layer, window);
  layer_add_child(window_layer, menu_layer_get_layer(time_slot_menu_layer));
  APP_LOG(APP_LOG_LEVEL_DEBUG, "time_slot_window_load end");

}

static void time_slot_window_unload(Window *window) {
  //menu_layer_destroy(time_slot_menu_layer);
  day_selected = -1;
}





// Day Window

static int16_t day_get_cell_height_callback(struct MenuLayer *menu_layer, MenuIndex *cell_index, void *data) {
  return 44;
}

static void day_draw_row_callback(GContext* ctx, Layer *cell_layer, MenuIndex *cell_index, void *data) {
  const int index = cell_index->row;
  switch (index) {
      case 0:
        menu_cell_basic_draw(ctx, cell_layer, "Wednesday", "March 5", NULL);
        break;
      case 1:
        menu_cell_basic_draw(ctx, cell_layer, "Thursday", "March 6", NULL);
        break;
      case 2:
        menu_cell_basic_draw(ctx, cell_layer, "Friday", "March 7", NULL);
        break;
      case 3:
        menu_cell_basic_draw(ctx, cell_layer, "About", NULL, NULL);
  }
}

static uint16_t day_get_num_rows_callback(struct MenuLayer *menu_layer, uint16_t section_index, void *data) {
  return 4;
}

static void day_select_callback(MenuLayer *menu_layer, MenuIndex *cell_index, void *data) {
  APP_LOG(APP_LOG_LEVEL_DEBUG, "Day Select");

  day_selected = cell_index->row;
  
  time_slot_window = window_create();
  window_set_window_handlers(time_slot_window, (WindowHandlers) {
    .load = time_slot_window_load,
    .unload = time_slot_window_unload,
  });
  window_stack_push( time_slot_window, true );
}

static void day_window_load(Window *window) {
  Layer *window_layer = window_get_root_layer(window);
  GRect bounds = layer_get_bounds(window_layer);

  GRect window_frame = layer_get_frame(window_layer);
  day_menu_layer = menu_layer_create(window_frame);
  menu_layer_set_callbacks(day_menu_layer, NULL, (MenuLayerCallbacks) {
    .get_cell_height = (MenuLayerGetCellHeightCallback) day_get_cell_height_callback,
    .draw_row = (MenuLayerDrawRowCallback) day_draw_row_callback,
    .get_num_rows = (MenuLayerGetNumberOfRowsInSectionsCallback) day_get_num_rows_callback,
    .select_click = (MenuLayerSelectCallback) day_select_callback,
    //.select_long_click = (MenuLayerSelectCallback) day_select_long_callback
  });
  menu_layer_set_click_config_onto_window(day_menu_layer, window);
  layer_add_child(window_layer, menu_layer_get_layer(day_menu_layer));
}

static void day_window_unload(Window *window) {
  //menu_layer_destroy(day_menu_layer);
}




static void init(void) {
  day_window = window_create();
  window_set_window_handlers(day_window, (WindowHandlers) {
    .load = day_window_load,
    .unload = day_window_unload,
  });
  window_stack_push(day_window, true);
}

static void deinit(void) {
  window_destroy(day_window);
}

int main(void) {
  init();
  app_event_loop();
  deinit();
}
