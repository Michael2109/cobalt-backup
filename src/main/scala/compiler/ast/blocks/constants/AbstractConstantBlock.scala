/*
 * Cobalt Programming Language Compiler
 * Copyright (C) 2017  Cobalt
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package compiler.ast.blocks.constants

import compiler.ast.blocks.Block

/**
  * The parent of all constant blocks to group them together.
  *
  * @param sBlockInit
  * @param container Whether the blocks contains other blocks
  * @param variable  Whether the blocks is a variable
  * @param immutable
  */
abstract class AbstractConstantBlock(sBlockInit: Block, container: Boolean, variable: Boolean, immutable: Boolean = false) extends Block(sBlockInit, container, variable, immutable) {

}
