#include <pebble.h>

static Window *day_window;
static MenuLayer *day_menu_layer;


// Day Window

static int16_t day_get_cell_height_callback(struct MenuLayer *menu_layer, MenuIndex *cell_index, void *data) {
  return 44;
}

static void day_draw_row_callback(GContext* ctx, Layer *cell_layer, MenuIndex *cell_index, void *data) {
  const int index = cell_index->row;
  switch (index) {
      case 0:
        menu_cell_basic_draw(ctx, cell_layer, "Wednesday", "March 7", NULL);
        break;
      case 1:
        menu_cell_basic_draw(ctx, cell_layer, "Thursday", "March 8", NULL);
        break;
      case 2:
        menu_cell_basic_draw(ctx, cell_layer, "Friday", "March 9", NULL);
        break;
      case 3:
        menu_cell_basic_draw(ctx, cell_layer, "About", NULL, NULL);
  }
}

static uint16_t day_get_num_rows_callback(struct MenuLayer *menu_layer, uint16_t section_index, void *data) {
  return 4;
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
    //.select_click = (MenuLayerSelectCallback) day_select_callback,
    //.select_long_click = (MenuLayerSelectCallback) day_select_long_callback
  });
  menu_layer_set_click_config_onto_window(day_menu_layer, window);
  layer_add_child(window_layer, menu_layer_get_layer(day_menu_layer));
}

static void day_window_unload(Window *window) {
  menu_layer_destroy(day_menu_layer);
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
